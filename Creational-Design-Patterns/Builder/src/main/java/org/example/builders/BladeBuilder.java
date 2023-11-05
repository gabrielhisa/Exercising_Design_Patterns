package org.example.builders;

import org.example.components.Blade;
import org.example.components.Guard;
import org.example.components.Handle;
import org.example.components.Sheath;

public interface BladeBuilder {
    void setBlade(Blade blade);
    void setHandle(Handle handle);
    void setGuard(Guard guard);
    void setSheath(Sheath sheath);
    void getBuildDesc();
}
