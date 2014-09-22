DESCRIPTION = "This module provides a few convenience methods for testing \
exception based code. It is built with Test::Builder and plays happily with \
Test::More and friends."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-2.0"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Exception"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"

SRC_URI = "http://cpan.metacpan.org/authors/id/E/EX/EXODIST/Test-Exception-0.35.tar.gz"

SRC_URI[md5sum] = "d774ff26e5fcd67d6364a990b61e62ca"
SRC_URI[sha256sum] = "a84b71dfba618d76c943e33322d0e2603ee4f9a7e4389870ad727396bf878d2a"
RDEPENDS_${PN} += "sub-uplevel-perl"

S = "${WORKDIR}/Test-Exception-${PV}"

inherit cpan

BBCLASSEXTEND = "native"
