# AllayReplication
A rather basic plugin that implements (as close to vanilla as possible to achieve in a day) Allay replication mechanics in 1.19 for those who do not wish to update to 1.19.1

## In-game Usage
To trigger any action the Allay must be leashed and unleashed (or just unleashed if already leashed). 
The plugin then checks the following conditions:
- A jukebox must be playing within a 7 block radius of the Allay (analagous to the vanilla dancing requirement)
- A block of amethyst must be within the same 7 blocm radius (analagous to handing over a amethyst shard)
- Has the Allay been replicated recently - after each replication the original and replicated Allay have a 2.5 minute cooldown before they can replicate again.

## Requirements
For efficiency, the plugin uses the PaperMC fork of Spigot. Support for standard Spigot is not guaranteed.
