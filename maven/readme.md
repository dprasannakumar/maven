[![Build Status](https://travis-ci.org/RutledgePaulV/maven.svg?branch=develop)](https://travis-ci.org/RutledgePaulV/maven)
[![Coverage Status](https://coveralls.io/repos/github/RutledgePaulV/maven/badge.svg?branch=develop)](https://coveralls.io/github/RutledgePaulV/maven?branch=develop)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.rutledgepaulv/maven/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.rutledgepaulv/maven)





Release Versions
```xml
<dependencies>
    <dependency>
        <groupId>prasanna</groupId>
        <artifactId>maven</artifactId>
        <version><!-- Not yet released --></version>
    </dependency>
</dependencies>
```

Snapshot Versions
```xml
<dependencies>
    <dependency>
        <groupId>prasanna</groupId>
        <artifactId>maven</artifactId>
        <version>0.0.1-SNAPSHOT</version>
    </dependency>
</dependencies>

<repositories>
    <repository>
        <id>ossrh</id>
        <name>Repository for snapshots</name>
        <url>https://oss.sonatype.org/content/repositories/snapshots</url>
        <snapshots>
            <enabled>true</enabled>
        </snapshots>
    </repository>
</repositories>
```


This project is licensed under [MIT license](http://opensource.org/licenses/MIT).
