package org.quarkus;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection(targets = {Person.class})
public class ReflectionConfig
{
}

