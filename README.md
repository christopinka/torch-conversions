### Development

* Generate project structure - Kotlin, Gradle, Git
* Gradle
  * add `poi` dependencies
  * add execute task for `gradle run`
* POI
  * experiment with extracting json
  * use poi documentation - [xml slideshow](https://poi.apache.org/apidocs/dev/org/apache/poi/xslf/usermodel/XMLSlideShow.html)
  * use Gson lib to extract Json from List of Map
 
 
### Build and Run

* run `gradle build`
* run `gradle run`
  * torch.pptx read from `resources` directory
  * presentation.json written to `resources` directory
  * json output to console

### Process
* wanted to try Kotlin
  * good choice for small project (lambda)?
  * Object-oriented + Functional
  * Strongly statically typed
  * Concise
  * Interoperable with Java

* Gradle over Maven
* Was familiar with Apache POI library but tried Aspose first to see how it worked.
* Not test-driven since it is an experiment. Once direction is decided for production, would throw away and use as template for TDD.
* Started looking at Lambda Handler implementation with `App.kt`

