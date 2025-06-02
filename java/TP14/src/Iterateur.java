public class Iterateur {
private Iterateur () {}
/* * m é thode statique mystere0 */
public static int mystere0 ( Iterable < Integer > coll ) {
Iterator < Integer > iterateur = coll . iterator () ;
i n t res = 0;
while ( iterateur . hasNext () ) {
res += 1;
iterateur . next () ;
}
return res ;
}
/* * m é thode statique mystere1 */
public s t a t i c <T > boolean mystere1 ( Iterable <T > coll , T elem ) {
Iterator <T > iterateur = coll . iterator () ;
while ( iterateur . hasNext () ) {
i f ( iterateur . next () . equals ( elem ) ) {
return true ;
}
}
return f a l s e ;
