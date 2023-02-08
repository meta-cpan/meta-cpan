DESCRIPTION = "This module exports a single function: "ttie". "ttie" ties a variable to a \
type constraint, ensuring that whatever values stored in the variable will \
conform to the type constraint. If the type constraint has coercions, these \
will be used if necessary to ensure values assigned to the variable \
conform."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Type-Tie"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOBYINK/Type-Tie-0.015.tar.gz"

SRC_URI[md5sum] = "3b256ada69018146efe0e86065f3b847"
SRC_URI[sha256sum] = "4e5a3f6737efd59b4e395af2f95d02e564fc57aa723e32a13eb2a1788d6d5434"
RDEPENDS:${PN} += "exporter-tiny-perl"
RRECOMMENDS:${PN} += "hash-fieldhash-perl"

S = "${WORKDIR}/Type-Tie-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
