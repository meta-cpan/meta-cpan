DESCRIPTION = "This module provides one function, "equals" (not exported by default)."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/String-Compare-ConstantTime"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/F/FR/FRACTAL/String-Compare-ConstantTime-0.321.tar.gz"

SRC_URI[md5sum] = "cf1801b75417107509134740c221e74c"
SRC_URI[sha256sum] = "0b26ba2b121d8004425d4485d1d46f59001c83763aa26624dff6220d7735d7f7"

S = "${WORKDIR}/String-Compare-ConstantTime-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
