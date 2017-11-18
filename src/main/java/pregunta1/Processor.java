package pregunta1;

public abstract class Processor {
    private ProcessorType type;
    private ProcessorFrequency frequency;
    private float price;
    
        
    
    public ProcessorType getType() {
        return type;
    }
    
    public ProcessorFrequency getFrequency() {
        return frequency;
    }
    
    public float getPrice() {
        return price;
    }
    
    public String toString() {
        return this.type.toString() + " | " + this.frequency.toString() + " | " + this.price;
    }
}
