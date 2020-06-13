# Втора лабораториска вежба по Софтверско инженерство

## Хамза Јашари,185062

#### Група на код: 5

#### Control Flow Graph:

![arc](https://i.ibb.co/HzYZrfj/Untitled-Diagram-1.jpg)

#### Цикломатска комплексност:

Цикломатската комплексност на овој код е 4, истата ја добив преку формулата E-N+2, каде што E е бројот на ребра и N е бројот на јазли.

#### Тест случаи според критериумот Еvery Path

```
@Test
void Everypath(){
    List<String> input= new ArrayList<>();
    input.add("1");
    input.add("2");
    input.add("0");
    List<String> output=new ArrayList<>();
    output.add("0");
    output.add("0");
    output.add("0");
    assertThrows(IllegalArgumentException.class,() -> siLab2.function((createList())));
    assertEquals(siLab2.function(input),output);
    output.clear();
    input.clear();
    input.add("0");
    input.add("#");
    output.add("1");
    output.add("#");
    assertEquals(siLab2.function(input),output);
    output.clear();
    input.clear();
    input.add("#");
    input.add("0");
    output.add("#");
    output.add("1");
    assertEquals(siLab2.function(input),output);
    output.clear();
    input.clear();
    input.add("#");
    input.add("0");
    input.add("#");
    input.add("0");
    output.add("#");
    output.add("2");
    output.add("#");
    output.add("1");
    assertEquals(siLab2.function(input),output);
}
```

#### Тест случаи според критериумот Multiple condtition

```
void Multiple(){
    List<String> input= new ArrayList<>();
    List<String> output=new ArrayList<>();
    output.clear();
    input.clear();
    input.add("#");
    input.add("0");
    input.add("#");
    input.add("0");
    output.add("#");
    output.add("2");
    output.add("#");
    output.add("1");
    // TT
    assertEquals(siLab2.function(input),output);
    output.clear();
    input.clear();
    input.add("0");
    input.add("0");
    input.add("0");
    input.add("0");
    output.add("0");
    output.add("0");
    output.add("0");
    output.add("0");
    //TF
    assertEquals(siLab2.function(input),output);
    output.clear();
    input.clear();
    input.add("0");
    output.add("0");
    //FX
    assertEquals(siLab2.function(input),output);
 //------------------------------------------------------------------------------
    output.clear();
    input.clear();
    input.add("0");
    input.add("#");
    input.add("0");
    input.add("#");
    output.add("1");
    output.add("#");
    output.add("2");
    output.add("#");
    // TT
    assertEquals(siLab2.function(input),output);
    output.clear();
    input.clear();
    input.add("0");
    input.add("0");
    input.add("0");
    input.add("0");
    output.add("0");
    output.add("0");
    output.add("0");
    output.add("0");
    //TF
    assertEquals(siLab2.function(input),output);
    output.clear();
    input.clear();
    input.add("0");
    output.add("0");
    //FX
    assertEquals(siLab2.function(input),output);
}
```

#### Објаснување на напишаните unit tests

######    Every Path :  

   Со овој критериум ги контролираме сите можни комбинации , како може програмата да иде, пр (Од почеток да викаме функцијата и да му дадеме некоја листа со нула аргументи, веднаш после првиот if ке има некоја IllegalArgumentException ).
   Тоа е една од комбинациите и така на сите други if condition , јас преку Тест функција ги пишав сите можни input и output на таа функција , користив дополнителна листа .
  | Every Path | size<=0| list.get(i).equals('#')|	list.size()=2 && list.get(0)!=#	list.size>i+1|	Succ|
1	*	*	*	*	*
2	*	*	*	*	*
3	*				
4		*	*	*	*
5.1		*	*	*	*
5.2		*	*	*	*
5.3		*	*	*	*
6		*	*	*	*
7			*	*	*
8			*	*	*
9				*	*
10			*	*	*
11			*		*
12			*	*	*
13		*			
14	*	*	*	*	*
15		*	*	*	*
16		*	*	*	*



######   Multiple condition:

   Во овој критериум  се фокусираме каде има multiple condition , и тестираме сите можни комбинации , пр ( Т && T , T && F , FX )   исто како прв критериум користив листа и немав error. 
