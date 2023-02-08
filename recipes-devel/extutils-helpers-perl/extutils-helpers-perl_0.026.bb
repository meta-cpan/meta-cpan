DESCRIPTION = "This module provides various portable helper functions for module building \
modules."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/ExtUtils-Helpers"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LE/LEONT/ExtUtils-Helpers-0.026.tar.gz"

SRC_URI[md5sum] = "83b00c1e401321c425ae5db6b2b2fd12"
SRC_URI[sha256sum] = "de901b6790a4557cf4ec908149e035783b125bf115eb9640feb1bc1c24c33416"

S = "${WORKDIR}/ExtUtils-Helpers-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
