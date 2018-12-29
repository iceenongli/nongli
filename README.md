# nongli
公历转农历(1700-3100)

农历是中国最常用的日历之一，具有悠久的历史。
但是农历是非常复杂的，它的大小月及闰月几乎没有任何规律。
本算法解决了 1700-3100 一千年多年公历转农历的问题。

Lunar Calendar

The lunar calendar is one of the most commonly used calendars in China and has a long history.
But the lunar calendar is very complex, and its size and leap month almost no law.
This algorithm solves the problem of the lunar calendar of 1700-3100 years.
</br>
</br>
使用示例:</br>
String date = "20170101";</br>
String str = NongLi.getDate(date);</br>
System.out.println(str);</br>
</br>
maven地址:</br>
&lt;dependency&gt;</br>
&nbsp;&nbsp;&nbsp;&nbsp;&lt;groupId&gt;com.iceyyy&lt;/groupId&gt;</br>
&nbsp;&nbsp;&nbsp;&nbsp;&lt;artifactId&gt;icenongli&lt;/artifactId&gt;</br>
&nbsp;&nbsp;&nbsp;&nbsp;&lt;version&gt;2.0&lt;/version&gt;</br>
&lt;/dependency&gt;</br>
