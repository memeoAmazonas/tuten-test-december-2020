  <h3 align="center">Get utc format</h3>

<details open="open">
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#Installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#run-application">Run application</a></li>
    <li><a href="#call-services">Call Service</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>



<!-- GETTING STARTED -->
## Getting Started

### Prerequisites

* apache maven
* java version 1.8

### Installation

1. Clone the repo
   ```sh
   git clone https://github.com/memeoAmazonas/tuten-test-december-2020.git
   ```
2. open the console and execute
   ```
   mvn clean
   ```
   ```
   mvn install
   ```
## run-application
execute
 ```
mvn spring-boot:run
   ```
## call-application
use postman or other Rest client

* <strong>POST METHOD</strong>
* url ```http://localhost:8080/timezone```
* Request body ```{dato1: "18:31:45", dato2: "-3"}```
* Response ``` {  "response":{
                                "time":"21:31:45", 
                                "timezone":"utc" 
                             } 
               } ```

<!-- CONTACT -->
## Contact

José Ortíz - [@ajjicero](https://twitter.com/ajjicero) - proyectosjgot@gmail.com
