DESCRIPTION = "RECOMMENDATION 1: If you are writing modern Perl code with Moose or Moo I \
highly recommend using Throwable instead of this module."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Exception-Class"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Exception-Class-1.45.tar.gz"

SRC_URI[md5sum] = "1e564d20b374a99fdf660ba3f36b0098"
SRC_URI[sha256sum] = "5482a77ef027ca1f9f39e1f48c558356e954936fc8fbbdee6c811c512701b249"
RDEPENDS:${PN} += "class-data-inheritable-perl"
RDEPENDS:${PN} += "devel-stacktrace-perl"

S = "${WORKDIR}/Exception-Class-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
