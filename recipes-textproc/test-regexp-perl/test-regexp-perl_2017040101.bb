DESCRIPTION = "This module is intended to test your regular expressions. Given a subject \
string and a regular expression (aka pattern), the module not only tests \
whether the regular expression complete matches the subject string, it \
performs a "utf8::upgrade" or "utf8::downgrade" on the subject string and \
performs the tests again, if necessary. Furthermore, given a pattern with \
capturing parenthesis, it checks whether all captures are present, and in \
the right order. Both named and unnamed captures are checked."

SECTION = "libs"
LICENSE = "MIT"
PR = "r0"

MAINTAINER=	"Poky <poky@yoctoproject.org>"
HOMEPAGE=	"https://metacpan.org/release/Test-Regexp"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://cpan.metacpan.org/authors/id/A/AB/ABIGAIL/Test-Regexp-2017040101.tar.gz"

SRC_URI[md5sum] = "b5ced2b3e3ba666a153da163b0173325"
SRC_URI[sha256sum] = "35cb41df5c5017835b89b853d5a44e25e6da973b450e1edca51bba70e7041e54"

S = "${WORKDIR}/Test-Regexp-${PV}"

inherit cpan allarch

BBCLASSEXTEND = "native"
