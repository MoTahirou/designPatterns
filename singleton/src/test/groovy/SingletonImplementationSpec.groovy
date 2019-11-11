import spock.lang.Specification

class SingletonImplementationSpec extends  Specification{

    void 'Our singleton is a true singleton'() {
        given:
        SingletonImplementation single1  = SingletonImplementation.getInstance()
        SingletonImplementation single2  = SingletonImplementation.getInstance()

        expect:
        single1 == single2
    }
}
