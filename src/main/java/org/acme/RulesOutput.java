package org.acme;

import lombok.AllArgsConstructor;
import lombok.With;

@AllArgsConstructor
public class RulesOutput {
    @With
    public RulesResponse fullData;
    @With
    public RulesResponse sortedData;

}
