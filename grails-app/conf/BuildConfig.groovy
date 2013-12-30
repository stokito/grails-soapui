grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir = "target/test-reports"

grails.project.fork = [
    // configure settings for compilation JVM, note that if you alter the Groovy version forked compilation is required
    //  compile: [maxMemory: 256, minMemory: 64, debug: false, maxPerm: 256, daemon:true],

    // configure settings for the test-app JVM, uses the daemon by default
    test: [maxMemory: 768, minMemory: 64, debug: false, maxPerm: 256, daemon:true],
    // configure settings for the run-app JVM
    run: [maxMemory: 768, minMemory: 64, debug: false, maxPerm: 256, forkReserve:false],
    // configure settings for the run-war JVM
    war: [maxMemory: 768, minMemory: 64, debug: false, maxPerm: 256, forkReserve:false],
    // configure settings for the Console UI JVM
    console: [maxMemory: 768, minMemory: 64, debug: false, maxPerm: 256]
]

grails.project.dependency.resolver = "maven" // or ivy
grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits("global") {
        // uncomment to disable ehcache
        // excludes 'ehcache'
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    repositories {
        grailsCentral()
        mavenLocal()
        mavenCentral()
        // uncomment the below to enable remote dependency resolution
        // from public Maven repositories
        //mavenRepo "http://repository.codehaus.org"
        //mavenRepo "http://download.java.net/maven/2/"
        //mavenRepo "http://repository.jboss.com/maven2/"
        // SoupUI repository
        mavenRepo('http://www.soapui.org/repository/maven2')
    }
    dependencies {
        test('eviware:soapui:4.5.1')
        test('eviware:soapui-xmlbeans:4.5.1')
        test('eviware:soap-xmlbeans:1.2')
        test('junit:junit::4.9')
        test('commons-lang:commons-lang:2.4')
        test('commons-beanutils:commons-beanutils:1.8.3')
        test('commons-collections:commons-collections:3.2.1')
        test('log4j:log4j:1.2.8')
        test('commons-cli:commons-cli:1.2')
        test('saxon:saxon-dom:9.1.0.8j')
        test('javax.jms:jms:1.1')
        test('javax.mail:mail:1.4')
        test('org.mortbay.jetty:servlet-api:2.5-20081211')
        test('wsdl4j:wsdl4j:1.6.2')
        test('xmlbeans:xbean_xpath:2.4.0')
        test('xmlbeans:xbean:fixed-2.4.0')
        test('org.apache.httpcomponents:httpclient:4.1.1')
        test('fife:rsyntaxtextarea:2.0.1')
        test('xerces:xercesImpl:2.9.1')
        test('bouncycastle:bcprov-jdk15:144')
        test('xmlunit:xmlunit:1.2')
        test('amf:flex-messaging-common:1.0')
        test('amf:flex-messaging-core:1.0')
        test('saxon:saxon:9.1.0.8j')
        test('jetty:jetty:6.1.26')
        test('jetty:jetty-util:6.1.26')
        test('javax.servlet:servlet-api:2.5')
        test('net.sf.saxon:saxon-dom:8.7')
    }

    plugins {
        build(":release:3.0.1",
              ":rest-client-builder:1.0.3") {
            export = false
        }
    }
}
