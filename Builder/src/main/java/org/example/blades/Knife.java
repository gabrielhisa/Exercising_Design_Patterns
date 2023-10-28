package org.example.blades;

import org.example.components.Blade;
import org.example.components.Guard;
import org.example.components.Handle;
import org.example.components.Sheath;

public class Knife {
    private final Blade blade;
    private final Handle handle;
    private final Guard guard;
    private final Sheath sheath;

    public Knife(Blade blade, Handle handle, Guard guard, Sheath sheath) {
        this.blade = blade;
        this.handle = handle;
        this.guard = guard;
        this.sheath = sheath;
    }

    public Blade getBlade() {
        return blade;
    }

    public Handle getHandle() {
        return handle;
    }

    public Guard getGuard() {
        return guard;
    }

    public Sheath getSheath() {
        return sheath;
    }
}
