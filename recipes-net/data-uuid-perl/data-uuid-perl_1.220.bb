DESCRIPTION = "This module provides a framework for generating v3 UUIDs (Universally \
Unique Identifiers, also known as GUIDs (Globally Unique Identifiers). \
A UUID is 128 bits long, and is guaranteed to be different from all other \
UUIDs/GUIDs generated until 3400 CE."

SECTION = "libs"
LICENSE = "BSD-3-Clause"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Data-UUID"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/BSD-3-Clause;md5=550794465ba0ec5312d6919e203a55f9"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RJ/RJBS/Data-UUID-1.220.tar.gz"

SRC_URI[md5sum] = "3db849cb2ebedd969cb0090d91e39712"
SRC_URI[sha256sum] = "99533b06e4348d704e3d2252d7d41aa652680a1bd5af04e1dc8ce7e84e74f960"

S = "${WORKDIR}/Data-UUID-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
