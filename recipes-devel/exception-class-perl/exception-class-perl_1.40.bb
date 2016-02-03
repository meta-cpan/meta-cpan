DESCRIPTION = "RECOMMENDATION 1: If you are writing modern Perl code with Moose or Moo I \
highly recommend using Throwable instead of this module."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Exception-Class"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Exception-Class-1.40.tar.gz"

SRC_URI[md5sum] = "07cd7a38be5f8134955e943cf666d453"
SRC_URI[sha256sum] = "d1171f2d03a485e87eb561f34688991c17b939d2689bcda47f3f51b372669a1f"
RDEPENDS_${PN} += "class-data-inheritable-perl"
RDEPENDS_${PN} += "devel-stacktrace-perl"

S = "${WORKDIR}/Exception-Class-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
