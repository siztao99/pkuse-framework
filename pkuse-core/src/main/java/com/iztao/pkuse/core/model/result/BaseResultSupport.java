package com.iztao.pkuse.core.model.result;

import com.iztao.pkuse.core.constant.BaseErrorCode;
import com.iztao.pkuse.core.model.domain.BaseDO;
import lombok.Data;
import lombok.Getter;

/**
 * Package: com.app.api.base
 * User: min_xu
 * Date: 16/8/19 下午3:01
 * 说明：
 */
@Data
public abstract class BaseResultSupport extends BaseDO {

    @Getter
    protected int code = BaseErrorCode.SUCCESS_CODE;

    @Getter
    protected String msg = "";

    @Getter
    protected boolean success = true;

    protected BaseResultSupport(boolean success,int code, String msg) {
        this.success = success;
        this.code = code;
        this.msg = msg;
    }

    public abstract static class Builder<R extends BaseResultSupport, B extends Builder<R, B>> {

        private B theBuilder;

        protected Boolean success;
        protected Integer code;
        protected String msg;

        public Builder () {
            theBuilder = getThis();
        }

        protected abstract B getThis();

        public B code(Integer code) {
            this.code = code;
            return theBuilder;
        }

        public B msg(String msg) {
            this.msg = msg;
            return theBuilder;
        }

        public B success(Boolean success) {
            this.success = success;
            return theBuilder;
        }

        public abstract R build();

    }


}
