import super_hero as Sh

avengers={
'Spiderman':(5,5,'araignéeaquatrepattes'),
'Hulk':(7,4,"Grandhommevert"),
'Agent13':(2,3,'agent13'),
'Melin':(2,6,'expertenarchi')
}

exemple2 = {'a':(1,1,'a'), 'b': (3, 9, 'b'), 'c':(7, 2, 'c')}
ewemple3 = {'a':(1,1,'a'), 'b': (3, 9, 'b'), 'd':(4, 4, 'c')}

def test_intelligence_moyenne():
    assert Sh.intelligence_moyenne(avengers) == 18/4 
    assert Sh.intelligence_moyenne({}) == None
    assert Sh.intelligence_moyenne(exemple2) == 4 
    assert Sh.intelligence_moyenne(ewemple3) == 14/3

def test_le_plus_fort():
    assert Sh.intelligence_moyenne(avengers) == 'Hulk' 
    assert Sh.intelligence_moyenne({}) == ""
    assert Sh.intelligence_moyenne(exemple2) == 'c'
    assert Sh.intelligence_moyenne(ewemple3) == 'd'