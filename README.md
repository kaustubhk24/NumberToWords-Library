# NumberToWords Library


```java
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

```java
dependencies {
	        implementation 'com.github.kaustubhk24:NumberToWords-Library:Tag'
	}
```


To print , create instance
```java

        NumberToWords instance_name=new NumberToWords();
        if(number>0)
        {
            instance_name.startPrint(number);
            in_words = new StringBuffer();

            for (String s : instance_name.output) {
                in_words.append(s);
                in_words.append(" ");
            }
            inwords.setText(in_words); //Your textview

        }

```
[![](https://jitpack.io/v/kaustubhk24/NumberToWords-Library.svg)](https://jitpack.io/#kaustubhk24/NumberToWords-Library)
