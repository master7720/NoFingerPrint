# NoFingerprint — Resource Pack Fingerprinting Patch

NoFingerprint is a fabric client-side mod that fixes an exploit in Minecraft’s resource pack downloader.
This vulnerability allows malicious servers to fingerprint your Minecraft account by forcing all resource pack downloads to occur in a server-controlled folder path.

# Why this matters

In vanilla Minecraft, when a server sends a resource pack, the game generates a download folder based on a server-provided UUID.
Some servers discovered they can:

Track players across sessions

Correlate accounts

Build unique device “fingerprints”

Log download identifiers tied to your account

All without your permission.

This creates a silent privacy leak and has already been weaponized on PvP and cracked servers.










