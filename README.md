# Number To Word Library



[![](https://jitpack.io/v/kaustubhk24/NumberToWords-Library.svg)](https://jitpack.io/#kaustubhk24/NumberToWords-Library)

# Usage 

Visit JitPack & Get Instructions [here](https://jitpack.io/#kaustubhk24/NumberToWords-Library)

OR

Follow Guide Below

Step 1:
Add it in your root build.gradle at the end of repositories:

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

```

Step 2: Add the dependency

( Always Use Latest version )

```
dependencies {
	        implementation 'com.github.kaustubhk24:NumberToWords-Library:194ad03fc1'
	}
  
  ```
  
 Step 3 : Create instances as you need. ( See example below)
  
```java
// For Lakh format

NumberToWordConverterLakhFormat  instance_for_lakh = new NumberToWordConverterLakhFormat();

String wordLakh = instance_for_lakh.convert(input_number);

// For Million Format

NumberToWordConverterMillionFormat  instance_for_Million = new NumberToWordConverterMillionFormat();

String wordMillion = instance_for_Million.convert(input_number);

// From 13/02/2021 Library Supports Negative Numbers , You can pass negative numbers also

// for example

String wordMillion = instance_for_Million.convert(-5552);



```


## Top Known Users

[Denomination](https://play.google.com/store/apps/details?id=com.justinclicks.denomination) app by [JustInClicks.com](https://www.justinclicks.com) uses this Library
