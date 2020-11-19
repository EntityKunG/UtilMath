# UtiMath
ใน Project จะประกอบไปด้วย FewFond, UtilMath 
# FewFond.class
มีไว้เพื่อแสดงผลเท่านั้น ตัวอย่างการ INPUT ก็ตามลักษณะดังนั้น
 ```java
Scanner reader = new Scanner(System.in);
System.out.println("INPUT: ");
int x = reader.nextInt();
ArrayList<Double> array = new ArrayList<Double>();
for (int i = 0; i < x; i++) 
{
	array.add(reader.nextDouble());
}
```
# UtiMath.class

มีไว้เพื่อดึงฟังก์ชันในตัวคลาสนั้นจะมี method ดังนี้
- getAverage
- getMidrange
- getMedian
- sortArray
