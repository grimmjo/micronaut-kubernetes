/*
 * Copyright 2017-2019 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.micronaut.kubernetes.client.v1.services;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.kubernetes.client.v1.Metadata;

/**
 * @see <a href="https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.13/#service-v1-core">Service v1 core</a>
 *
 * @author Álvaro Sánchez-Mariscal
 * @since 1.0.0
 */
@Introspected
public class Service {

    private Metadata metadata;
    private ServiceSpec spec;

    /**
     *
     * @return Standard object's metadata.
     */
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     *
     * @param metadata Standard object's metadata.
     */
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    /**
     *
     * @return A Spec which defines the behavior of a service.
     */
    public ServiceSpec getSpec() {
        return spec;
    }

    /**
     *
     * @param spec A Spec which defines the behavior of a service.
     */
    public void setSpec(ServiceSpec spec) {
        this.spec = spec;
    }

    @Override
    public String toString() {
        return "Service{" +
                "metadata=" + metadata +
                ", spec=" + spec +
                '}';
    }
}
