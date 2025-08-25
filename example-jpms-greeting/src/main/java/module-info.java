module com.example.greeting {
    exports com.example.domain.greeting;
    requires spring.beans;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.web;
    requires com.example.hello;
}
