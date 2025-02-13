package BeyondJava8Feature2;

sealed class A permits B,C {}

sealed class B extends A permits E{}

non-sealed class C extends A{}

final class D extends A{}

final class E extends B{}

public class Q4Q5 {}


