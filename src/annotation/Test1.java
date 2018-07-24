package annotation;

import java.lang.annotation.Annotation;

/**
 * 注解与反射。
 * 注解通过反射获取。首先可以通过 Class 对象的 isAnnotationPresent() 方法判断它是否应用了某个注解
 * public boolean isAnnotationPresent(Class<? extends Annotation> annotationClass) {}
 * 然后通过 getAnnotation() 方法来获取 Annotation 对象。
 * public <A extends Annotation> A getAnnotation(Class<A> annotationClass) {}
 * 或者是 getAnnotations() 方法。
 * public Annotation[] getAnnotations() {}
 * 前一种方法返回指定类型的注解，后一种方法返回注解到这个元素上的所有注解。
 */
@Perform
@Check
@TestAnnotation
public class Test1 {
    public static void main(String[] args) {

        boolean hasAnnotation = Test1.class.isAnnotationPresent(TestAnnotation.class);

        if (hasAnnotation) {
            TestAnnotation testAnnotation = Test1.class.getAnnotation(TestAnnotation.class);

            System.out.println("id:" + testAnnotation.id());
            System.out.println("msg:" + testAnnotation.msg());
        }

        Annotation[] annotations = Test1.class.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }
}
