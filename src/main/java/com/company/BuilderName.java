package com.company;

public class BuilderName {

    private String namespace;
    private String deployName;
    private String serviceName;

    private BuilderName(CMnNiFiDeloySABuilder builder) {
        this.namespace = builder.namespace;
        deployName = builder.deployName;
        serviceName = builder.serviceName;
    }


    public static final class CMnNiFiDeloySABuilder {
        private String namespace;
        private String deployName;
        private String serviceName;
        private String limit;

        public CMnNiFiDeloySABuilder namespace(String nameSpace) {
            this.namespace = nameSpace;
            return this;
        }

        public CMnNiFiDeloySABuilder deployName(String deployname) {
            this.deployName = deployname;
            return this;
        }

        public CMnNiFiDeloySABuilder serviceName(String servicename) {
            this.serviceName = servicename;
            return this;
        }

        public CMnNiFiDeloySABuilder limit(String limitBound) {
            this.limit = limitBound;
            return this;
        }

        public BuilderName build() {
            if (this.namespace == null || this.namespace.isEmpty()) {
                this.namespace = "namespace";
            }
            if (this.limit == null || this.limit.isEmpty()) {
                this.limit = "1";
            }
            if (this.deployName == null || this.deployName.isEmpty()) {
                this.deployName="deployment";

            }
            if (this.serviceName == null || this.serviceName.isEmpty()) {
                this.serviceName = this.deployName + "-svc";
            }
            return new BuilderName(this);
        }
    }

    @Override
    public String toString() {
        return "BuilderName{" +
                "namespace='" + namespace + '\'' +
                ", deployName='" + deployName + '\'' +
                ", serviceName='" + serviceName + '\'' +
                '}';
    }
}
