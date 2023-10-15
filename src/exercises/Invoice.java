package exercises;

public class Invoice {

    private String model;
    private String description;
    private double cost;
    private int count;


    public Invoice(String model, String description, double cost, int count) {
        setModel(model);
        setDescription(description);
        setCost(cost);
        setCount(count);
    }

    // Model
    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    // Description
    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    // Cost

    public void setCost(double cost) {
        if (cost > 0) {
            this.cost = cost;
        } else {
            this.cost = 0.0;
        }
    }
    public double getCost() {
        return cost;
    }

    // Count
    public void setCount(int count) {
        if (count > 0) {
            this.count = count;
        } else {
            this.count = 0;
        }
    }

    public int getCount() {
        return count;
    }

    // Amount
    public void getAmount() {
        System.out.println("Model: " + getModel());
        System.out.println("Description: " + getDescription());
        System.out.println("Cost: " + getCost());
        System.out.println("Count: " + getCount());
        System.out.println("Invoice amount " + cost * count);
    }

}