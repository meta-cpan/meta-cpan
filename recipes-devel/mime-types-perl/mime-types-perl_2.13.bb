DESCRIPTION = "MIME types are used in many applications (for instance as part of e-mail \
and HTTP traffic) to indicate the type of content which is transmitted. or \
expected. See RFC2045 at https://www.ietf.org/rfc/rfc2045.txt"

SECTION = "libs"
LICENSE = "Artisticv1 | GPLv1+"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MIME-Types"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MA/MARKOV/MIME-Types-2.13.tar.gz"

SRC_URI[md5sum] = "f2892ae9e6ea660a58746699c3924817"
SRC_URI[sha256sum] = "99c3376357bbe22cc8b6c78f560aa18d81621287695cd629008a6c4e66b77bf8"

S = "${WORKDIR}/MIME-Types-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
