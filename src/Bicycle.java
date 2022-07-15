
    import java.util.Objects;

    public class Bicycle {
        private String modelName;
        private int wheelsCount;

        public Bicycle(String modelName, int wheelsCount) {
            this.modelName = modelName;
            this.wheelsCount = wheelsCount;
        }
        public String getModelName() {
            return modelName;
        }

        public int getWheelsCount() {
            return wheelsCount;
        }

        public void setModelName(String modelName) {
            this.modelName = modelName;
        }

        public void setWheelsCount(int wheelsCount) {
            this.wheelsCount = wheelsCount;
        }

        @Override
        public String toString() {
            return "Bicycle{" +
                    "modelName='" + modelName + '\'' +
                    ", wheelsCount=" + wheelsCount +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Bicycle bicycle = (Bicycle) o;
            return wheelsCount == bicycle.wheelsCount && modelName.equals(bicycle.modelName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(modelName, wheelsCount);
        }

        public void updateTyre() {
            System.out.println("Меняем покрышку");
        }
    }


