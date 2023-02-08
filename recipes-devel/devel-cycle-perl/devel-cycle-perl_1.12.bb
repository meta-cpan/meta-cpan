DESCRIPTION = "This is a simple developer's tool for finding circular references in \
objects and other types of references. Because of Perl's reference-count \
based memory management, circular references will cause memory leaks."

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Devel-Cycle"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/L/LD/LDS/Devel-Cycle-1.12.tar.gz"

SRC_URI[md5sum] = "3d9a963da87b17398fab9acbef63f277"
SRC_URI[sha256sum] = "fd3365c4d898b2b2bddbb78a46d507a18cca8490a290199547dab7f1e7390bc2"

S = "${WORKDIR}/Devel-Cycle-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
