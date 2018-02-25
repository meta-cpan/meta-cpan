DESCRIPTION = "This module provides a C API for XS modules to hook into the callbacks of \
"PL_check"."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/B-Hooks-OP-Check"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/B-Hooks-OP-Check-0.22.tar.gz"

SRC_URI[md5sum] = "b02925eacea03913a922f4b45020b5ac"
SRC_URI[sha256sum] = "c7b5d1bef59ef9087ff67eb3168d2624be94ae5464469e259ad11bfb8ad8cdcd"
DEPENDS += "extutils-depends-perl-native"

S = "${WORKDIR}/B-Hooks-OP-Check-${PV}"

inherit cpan

BBCLASSEXTEND = "native"

FILES_${PN}-dbg += "${PERLLIBDIRS}/vendor_perl/${PERLVERSION}/auto/*/*/*/*/.debug"
