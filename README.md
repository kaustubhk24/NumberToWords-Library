# Number To Word Library



[![](https://jitpack.io/v/kaustubhk24/NumberToWords-Library.svg)](https://jitpack.io/#kaustubhk24/NumberToWords-Library)

# Usage 

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
