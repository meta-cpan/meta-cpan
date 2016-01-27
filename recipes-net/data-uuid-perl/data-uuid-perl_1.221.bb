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

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RJ/RJBS/Data-UUID-1.221.tar.gz"

SRC_URI[md5sum] = "7619929e8fe205a7fb83bc1c29ecbf99"
SRC_URI[sha256sum] = "3cc7b2a3a7b74b45a059e013f7fd878078500ea4b7269036f84556b022078667"

S = "${WORKDIR}/Data-UUID-${PV}"

inherit cpan

do_compile() {
	export LIBC="$(find ${STAGING_DIR_TARGET}/${base_libdir}/ -name 'libc-*.so')"
	cpan_do_compile
}

BBCLASSEXTEND = "native"
