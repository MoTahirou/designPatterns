public class Sandwich {

    //Provides a way to create immutable objects
    //Removes the need to creates a ton of getters and setters for complex objects
    //Design to handle complex constructors that take a lot of arguments
    //Doesn't need an interface but could be implemented with one
    public static class Builder {
        private String bread;
        private String lettuce;
        private String tomato;
        private String mayo;

        public Sandwich build(){
            return new Sandwich(this);
        }

        public Builder bread(String bread) {
            this.bread = bread;
            return this;
        }

        public Builder lettuce(String lettuce) {
            this.lettuce = lettuce;
            return this;
        }

        public Builder tomato(String tomato) {
            this.tomato = tomato;
            return this;
        }

        public Builder mayo(String mayo) {
            this.mayo = mayo;
            return this;
        }


    }

    private final String bread;
    private final String lettuce;
    private final String tomato;
    private final String mayo;

    private Sandwich(Builder builder) {
        bread = builder.bread;
        lettuce = builder.lettuce;
        tomato = builder.tomato;
        mayo = builder.mayo;
    }

    public String getBread() {
        return this.bread;
    }

    public String getLettuce() {
        return this.lettuce;
    }

    public String getTomato() {
        return this.tomato;
    }

    public String getMayo() {
        return this.mayo;
    }

}
