# gplatform
A Platform abstraction for Java to Web compilers like GWT and Teavm

## Build
To use this you can simply add the sources to your classpath.

### maven
To use with maven, just install the compiled classes to your local maven repo by calling

```
sh nobuto.sh -t installToMaven -vvv
```
and use the following dependency

```
<dependency>
  <groupId>de.exware</groupId>
  <artifactId>de.exware.gplatform</artifactId>
  <version>VERSION</version>
</dependency>
```
where VERSION should be replaced by the version number in version.txt.