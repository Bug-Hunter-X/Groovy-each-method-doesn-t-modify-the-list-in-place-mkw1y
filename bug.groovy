```groovy
def myMethod(List<String> list) {
    list.each { it.toUpperCase() }
    println list
}

myMethod(['a', 'b', 'c'])
```