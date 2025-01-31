/*
 * Mykhailo Pietielin 2017.
 * https://github.com/RoanDev
 * roanworkbox@gmail.com
 * GPL c:
 */

/*
 * Mykhailo Pietielin 2017.
 * https://github.com/RoanDev
 * roanworkbox@gmail.com
 * GPL c:
 */

package akiaki.hitbtc.api;

import akiaki.hitbtc.api.interfaces.NonceGenerator;

public class NonceCounter implements NonceGenerator {
    private static Long nonce = 0L;

    public long nextNonce() {
        synchronized (nonce) {
            return System.currentTimeMillis() + (nonce++);
        }
    }
}
