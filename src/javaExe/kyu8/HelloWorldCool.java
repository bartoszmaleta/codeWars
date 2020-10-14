package javaExe.kyu8;

public class HelloWorldCool {
    /**
     * Returns greeting
     *
     * @return greeting
     */
    public static String greet() {
        return "hello world!";
    }
}

class HelloWorld {

    public static interface EnterpriseCustomType<Type> {

        Type getAsType();

    }

    public static class CustomString
            implements EnterpriseCustomType<String> {

        private final String value;

        public CustomString(String value) {
            this.value = value;
        }

        @Override
        public String getAsType() {
            return value;
        }

    }

    public static interface CustomTypeProvider<Type> {

        Type getCustomType();

    }

    public static final class CustomStringProvider
            implements CustomTypeProvider<CustomString> {

        private final CustomString state;

        public CustomStringProvider(CustomString state) {
            this.state = state;
        }

        @Override
        public CustomString getCustomType() {
            return state;
        }

    }

    public static enum EnterpriseStringBuilderParameterState {

        NONE,
        NULL,
        DEFAULT,
        UNSET,
        YES,

        CUSTOMER

    }

    public static interface EnterpriseTypeBuilder<Type> {

        Type build(EnterpriseStringBuilderParameterState state);

    }

    public static abstract class AbstractEnterpriseStringBuilder
            implements EnterpriseTypeBuilder<CustomString> {

        protected final CustomString initialState;

        public AbstractEnterpriseStringBuilder(CustomString initialState) {
            this.initialState = initialState;
        }

        @Override
        public abstract CustomString build(EnterpriseStringBuilderParameterState state);

    }

    public static class EnterpriseBuilderFactoryException extends RuntimeException {

        public EnterpriseBuilderFactoryException() {
            super();
        }

        public EnterpriseBuilderFactoryException(String message) {
            super(message);
        }

        public EnterpriseBuilderFactoryException(Throwable t) {
            super(t);
        }

    }

    public static final class EnterpiseHelloWorldStringBuilderFactory {

        public static AbstractEnterpriseStringBuilder create(CustomStringProvider stateProvider) {
            return new AbstractEnterpriseStringBuilder(stateProvider.getCustomType()) {

                protected static final String HELLO_CONSTANT = "hello";
                protected static final String WORLD_CONSTANT = "world";

                @Override
                public final CustomString build(EnterpriseStringBuilderParameterState state) {
                    try {
                        if(state == null || state == EnterpriseStringBuilderParameterState.NULL) {
                            throw new EnterpriseBuilderFactoryException(new NullPointerException());
                        }

                        StringBuilder builder = new StringBuilder();
                        builder.append(HELLO_CONSTANT)
                                .append(" ")
                                .append(WORLD_CONSTANT)
                                .append(initialState.getAsType());

                        return new CustomString(builder.toString());
                    } catch(Exception e) {
                        throw new EnterpriseBuilderFactoryException(e);
                    }
                }

            };
        }

    }

    public static String greet() {
        AbstractEnterpriseStringBuilder builder = EnterpiseHelloWorldStringBuilderFactory
                .create(new CustomStringProvider(new CustomString("!")));
        CustomString string = builder.build(EnterpriseStringBuilderParameterState.YES);
        return string.getAsType();
    }
}