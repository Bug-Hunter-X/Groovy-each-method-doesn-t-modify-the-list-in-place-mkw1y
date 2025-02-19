```groovy
def myMethod(List<String> list) {
    list = list.collect { it.toUpperCase() }
    println list
}

myMethod(['a', 'b', 'c'])
```