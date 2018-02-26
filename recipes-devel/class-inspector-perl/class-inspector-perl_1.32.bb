DESCRIPTION = "Class::Inspector allows you to get information about a loaded class. Most \
or all of this information can be found in other ways, but they aren't \
always very friendly, and usually involve a relatively high level of Perl \
wizardry, or strange and unusual looking code. Class::Inspector attempts to \
provide an easier, more friendly interface to this information."

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Class-Inspector"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PL/PLICEASE/Class-Inspector-1.32.tar.gz"

SRC_URI[md5sum] = "db471d6ecf47fa054726553319b7c34f"
SRC_URI[sha256sum] = "cefadc8b5338e43e570bc43f583e7c98d535c17b196bcf9084bb41d561cc0535"

S = "${WORKDIR}/Class-Inspector-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
