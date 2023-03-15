DESCRIPTION = "MIME types are used in many applications (for instance as part of e-mail \
and HTTP traffic) to indicate the type of content which is transmitted. or \
expected. See RFC2045 at https://www.ietf.org/rfc/rfc2045.txt"

SECTION = "libs"
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/MIME-Types"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Artistic-1.0;md5=cda03bbdc3c1951996392b872397b798 \
file://${COMMON_LICENSE_DIR}/GPL-1.0-or-later;md5=30c0b8a5048cc2f4be5ff15ef0d8cf61"

SRC_URI = "https://cpan.metacpan.org/authors/id/M/MA/MARKOV/MIME-Types-2.22.tar.gz"

SRC_URI[md5sum] = "be84dd3231e94baf34ea7943c3f5cc25"
SRC_URI[sha256sum] = "c2545eb30b094e942860ff8444f0f6cb54641caa8f7d386aaa2d925da4b02400"

S = "${WORKDIR}/MIME-Types-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
