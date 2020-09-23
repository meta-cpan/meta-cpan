DESCRIPTION = "This module provides a framework for generating v3 UUIDs (Universally \
Unique Identifiers, also known as GUIDs (Globally Unique Identifiers). A \
UUID is 128 bits long, and is guaranteed to be different from all other \
UUIDs/GUIDs generated until 3400 CE."

SECTION = "libs"
LICENSE = "BSD-3-Clause"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Data-UUID"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/BSD-3-Clause;md5=550794465ba0ec5312d6919e203a55f9"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RJ/RJBS/Data-UUID-1.226.tar.gz"

SRC_URI[md5sum] = "13468e0fb65a0b5ce27b8628cb2f0109"
SRC_URI[sha256sum] = "093d57ffa0d411a94bafafae495697db26f5c9d0277198fe3f7cf2be22996453"

S = "${WORKDIR}/Data-UUID-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
