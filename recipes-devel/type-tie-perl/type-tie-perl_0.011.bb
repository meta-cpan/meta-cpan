DESCRIPTION = "This module exports a single function: "ttie". "ttie" ties a variable to a \
type constraint, ensuring that whatever values stored in the variable will \
conform to the type constraint. If the type constraint has coercions, these \
will be used if necessary to ensure values assigned to the variable \
conform."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Type-Tie"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/T/TO/TOBYINK/Type-Tie-0.011.tar.gz"

SRC_URI[md5sum] = "77a5538f16bb713298b044f5a26267c0"
SRC_URI[sha256sum] = "824586455dcc699529ca1722fc13af7398b280b9767075ab0f2cb8711e381b05"
RDEPENDS_${PN} += "exporter-tiny-perl"
RRECOMMENDS_${PN} += "hash-fieldhash-perl"

S = "${WORKDIR}/Type-Tie-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
