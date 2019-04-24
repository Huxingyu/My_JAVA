1,java中有byte,int,short,long四种整数类型:

    //小数类型有float,double;
    //数组有三种表示方法：
    ```java
    int[] arr={1,2,3};
    int[] arr=new int[]{1,2,3};
    int[] arr=new int[3];
    arr[0]=1;arr[1]=2;arr[3]=3;
    ```

2,数组定义使用两块储存空间，方便不适用时垃圾回收;

3,如果一个变量是基本类型，比如：
```java
int x = 1;
```
这叫赋值;
而一个变量是类类型的话，我们就叫它引用,其中等号也不再是赋值的意思，表示“指向”：
```java
hero riki = new hero();
```

4，成员变量有四种修饰符:
```md
- public                    公众的
- private                   私有的
- protected                 受保护的
- package/friendly/default  不写
```

5,类与类之间的关系:
```md
自身,同包子类,不同包子类,同包类,其他类
```