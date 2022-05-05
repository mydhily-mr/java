package day15;

class FirstClassException extends RuntimeException
{
    FirstClassException(final String exp_msg) {
        super(exp_msg);
    }
}