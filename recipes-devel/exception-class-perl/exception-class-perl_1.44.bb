DESCRIPTION = "RECOMMENDATION 1: If you are writing modern Perl code with Moose or Moo I \
highly recommend using Throwable instead of this module."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Exception-Class"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Exception-Class-1.44.tar.gz"

SRC_URI[md5sum] = "6b5bb8e4ad2b1f6120fc1d33ae45e91b"
SRC_URI[sha256sum] = "33f3fbf8b138d3b04ea4ec0ba83fb0df6ba898806bcf4ef393d4cafc1a23ee0d"
RDEPENDS_${PN} += "class-data-inheritable-perl"
RDEPENDS_${PN} += "devel-stacktrace-perl"

S = "${WORKDIR}/Exception-Class-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
