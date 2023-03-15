DESCRIPTION = "Keeping packages clean When you define a function, or import one, into a \
Perl package, it will naturally also be available as a method. This does \
not per se cause problems, but it can complicate subclassing and, for \
example, plugin classes that are included via multiple inheritance by \
loading them as base classes."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/namespace-clean"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RI/RIBASUSHI/namespace-clean-0.27.tar.gz"

SRC_URI[md5sum] = "cba97f39ef7e594bd8489b4fdcddb662"
SRC_URI[sha256sum] = "8a10a83c3e183dc78f9e7b7aa4d09b47c11fb4e7d3a33b9a12912fd22e31af9d"
RDEPENDS:${PN} += "b-hooks-endofscope-perl"
RDEPENDS:${PN} += "package-stash-perl"

S = "${WORKDIR}/namespace-clean-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
